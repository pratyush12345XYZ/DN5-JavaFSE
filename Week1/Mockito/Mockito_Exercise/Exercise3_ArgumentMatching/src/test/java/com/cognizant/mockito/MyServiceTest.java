package com.cognizant.mockito;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testArgumentMatching() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.fetchData("101");

        verify(mockApi).getData(eq("101"));
    }

}