api.findLookupTableValues(
        "ProductCost",
        '-key2',
        Filter.equal('key1', out.Sku),
).find()?.attribute1