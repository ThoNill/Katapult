package tho.nill.verordnungen.simpleAttributes;

import javax.money.MonetaryAmount;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class MoneyAdapter implements AttributeConverter<MonetaryAmount, Long> {
	
	public MoneyAdapter() {
		super();
	}

	@Override
	public Long convertToDatabaseColumn(MonetaryAmount attribute) {
		if (attribute == null) {
			return 0L;
		}
		return attribute.getNumber().longValueExact();
	}

	@Override
	public MonetaryAmount convertToEntityAttribute(Long dbData) {
		if (dbData == null) {
			return Geld.getNull();
		}
		return Geld.createAmount(dbData);
	}

}
