package com.ricka.princy.endpoint.rest.controller;

import static com.ricka.princy.endpoint.rest.controller.health.PingController.OK;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.ricka.princy.PojaGenerated;
import com.ricka.princy.conf.FacadeIT;
import com.ricka.princy.endpoint.rest.controller.health.HealthDbController;
import com.ricka.princy.endpoint.rest.controller.health.PingController;
import com.ricka.princy.file.BucketComponent;
import com.ricka.princy.service.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

@PojaGenerated
class HealthControllerIT extends FacadeIT {

  @Autowired PingController pingController;
  @Autowired HealthDbController healthDbController;

  @Autowired PersonService personService;
  @MockBean BucketComponent bucketComponent;

  @Test
  void ping() {
    assertEquals("pong", pingController.ping());
  }

  @Test
  void can_read_from_dummy_table() {
    var responseEntity = healthDbController.dummyTable_should_not_be_empty();
    assertEquals(OK, responseEntity);
  }


  @Test
  void upload_file(){
    doNothing().when(bucketComponent).upload(any(), any());

    personService.uploadFile(any());

    verify(bucketComponent, times(1));
  }
}
