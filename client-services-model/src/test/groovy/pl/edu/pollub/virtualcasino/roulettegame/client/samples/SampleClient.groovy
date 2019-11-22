package pl.edu.pollub.virtualcasino.roulettegame.client.samples

import pl.edu.pollub.virtualcasino.roulettegame.client.Client

class SampleClient {

    static Client sampleClient(customProperties = [:]) {
        def properties = [] + customProperties
        return new Client()
    }
}
