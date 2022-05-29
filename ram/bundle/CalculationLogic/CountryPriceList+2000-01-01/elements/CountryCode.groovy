// Imports
def inputReader = libs.Input.reader

// Constants
final String INPUT_NAME = "Country"
final String INPUT_LABEL = "Country"

if (api.syntaxCheck) {
    Map<String, String> countryCode2Name = api.findLookupTableValues("CountryInfo").collectEntries {
        [(it.name): it.attribute1]
    }
    api.inputBuilderFactory().createOptionEntry(INPUT_NAME)
            .setLabel(INPUT_LABEL)
            .setOptions(countryCode2Name.keySet().toList())
            .setLabels(countryCode2Name)
            .setRequired(true)
            .getInput()
} else {
    return inputReader.readRequired(INPUT_NAME)
}