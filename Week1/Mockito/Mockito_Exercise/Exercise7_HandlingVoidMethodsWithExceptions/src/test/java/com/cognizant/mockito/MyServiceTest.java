package com.cognizant.mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testVoidMethodThrowsException() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doThrow(new RuntimeException("API Error"))
                .when(mockApi)
                .sendData();

        MyService service = new MyService(mockApi);

        assertThrows(RuntimeException.class, () -> {
            service.processData();
        });

        verify(mockApi).sendData();
    }

}