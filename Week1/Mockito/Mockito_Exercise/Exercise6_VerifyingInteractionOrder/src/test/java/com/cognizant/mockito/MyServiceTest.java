package com.cognizant.mockito;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class MyServiceTest {

    @Test
    public void testInteractionOrder() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.process();

        InOrder inOrder = inOrder(mockApi);

        inOrder.verify(mockApi).connect();
        inOrder.verify(mockApi).disconnect();
    }

}