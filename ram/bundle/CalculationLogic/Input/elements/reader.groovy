public <T> T readRequired(String inputName){
    return read(inputName, true)
}

public <T> T read(String inputName, Boolean required = false){
    def validator = libs.Input.validator

    def value = api.input(inputName) as T
    if(required){
        validator.validateRequired(value, "A value must be provided to the required input '$inputName'")
    }
    return value
}