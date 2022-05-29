BigDecimal call(Object value){
    if(!value){
        return null
    }
    if(!(value instanceof BigDecimal)){
        return null
    }
    return value
}

public <T> T validateRequired(T value, String message) {
    if(value == null){
        validationFailed(message)
    }
    return value
}

void validationFailed(String message){
    api.addWarning(message)
    api.abortCalculation()
}