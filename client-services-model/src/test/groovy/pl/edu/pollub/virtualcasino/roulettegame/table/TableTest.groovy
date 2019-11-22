package pl.edu.pollub.virtualcasino.roulettegame.table

import spock.lang.Specification
import spock.lang.Subject

import static pl.edu.pollub.virtualcasino.roulettegame.client.samples.SampleClient.sampleClient
import static pl.edu.pollub.virtualcasino.roulettegame.table.samples.SampleTable.sampleTable

class TableTest extends Specification {

    @Subject
    def table

    def "should client that create table be participant of table"() {
        given:
            def creator = sampleClient()
        when:
            table = sampleTable(creator: creator)
        then:
            table.isParticipant(creator)
    }

}
