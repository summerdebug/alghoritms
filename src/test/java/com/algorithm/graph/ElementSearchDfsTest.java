package com.algorithm.graph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Optional;
import org.junit.Test;


public class ElementSearchDfsTest {

    @Test
    public void givenElementSearchDfsWhenFindThenSuccessful() throws Exception {
        // Arrange
        Node node = GraphSearchTestUtil.get6NodesGraph();

        // Act
        Optional<Node> result = new ElementSearchDfs().find(6, node);

        // Assert
        assertTrue(result.isPresent());
        assertEquals(6, result.get().getId());
    }

}
