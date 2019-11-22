package pl.edu.pollub.virtualcasino.roulettegame.table.samples

import pl.edu.pollub.virtualcasino.roulettegame.client.Client
import pl.edu.pollub.virtualcasino.roulettegame.table.Table

import static pl.edu.pollub.virtualcasino.roulettegame.client.samples.SampleClient.sampleClient

class SampleTable {

    static Table sampleTable(customProperties = [:]) {
        def properties = [
                creator: sampleClient()
        ] + customProperties
        return new Table(properties.creator as Client)
    }

}
