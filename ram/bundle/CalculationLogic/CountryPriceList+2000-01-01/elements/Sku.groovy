
def validator = libs.Input.validator

return validator.validateRequired(api.currentItem()?.sku, "A sku has not been selected")