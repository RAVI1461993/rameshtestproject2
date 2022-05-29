import com.googlecode.genericdao.search.Filter

def validator = libs.PricingLib.Validate

String countryCode = out.CountryCode

String currency = api.vLookup('CountryInfo', 'Currency', countryCode)

if(!currency){
    validator.validationFailed("Failed to find currency for country code '$countryCode'")
}

return currency