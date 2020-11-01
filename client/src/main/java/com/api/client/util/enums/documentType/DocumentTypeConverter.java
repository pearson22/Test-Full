package com.api.client.util.enums.documentType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class DocumentTypeConverter implements AttributeConverter<DocumentType, String> {
    @Override
    public String convertToDatabaseColumn(DocumentType attribute) {
        if (attribute != null) return attribute.getName();
        return null;
    }

    @Override
    public DocumentType convertToEntityAttribute(String dbData) {
        return DocumentType.findById(dbData);
    }
}
