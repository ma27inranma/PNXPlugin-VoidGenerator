## How to create a void world (create a new one)
Go to (PNX-folder)/worlds/(your world name or default is "world")
create `config.json`

like
```json
{
  "format": "leveldb",
  "enable": true,
  "generators": {
    "0": {
      "name": "void",
      "seed": 1,
      "enableAntiXray": false,
      "antiXrayMode": "LOW",
      "preDeobfuscate": true,
      "dimensionData": {
        "dimensionName": "minecraft:overworld",
        "dimensionId": 0,
        "minHeight": -64,
        "maxHeight": 319,
        "height": 384,
        "chunkSectionCount": 24
      },
      "preset": {}
    }
  }
}
```

`$.generators[0].name` must be "void"
