package com.camunda.demo.insuranceapplication.springboot;

import com.camunda.demo.insuranceapplication.configuration.LogHistoryEventHandler;
import org.camunda.bpm.engine.ProcessEngineConfiguration;
import org.camunda.bpm.engine.impl.history.handler.CompositeHistoryEventHandler;
import org.camunda.bpm.engine.impl.history.handler.DbHistoryEventHandler;
import org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration;
import org.camunda.bpm.spring.boot.starter.configuration.CamundaHistoryLevelAutoHandlingConfiguration;
import org.camunda.bpm.spring.boot.starter.configuration.impl.AbstractCamundaConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyHistoryConfiguration extends AbstractCamundaConfiguration implements CamundaHistoryLevelAutoHandlingConfiguration {

  @Override
  public void preInit(SpringProcessEngineConfiguration configuration) {
    configuration.setHistory(ProcessEngineConfiguration.HISTORY_FULL);
  
    CompositeHistoryEventHandler compositeHistoryEventHandler = new CompositeHistoryEventHandler();
    compositeHistoryEventHandler.add(new LogHistoryEventHandler());
    compositeHistoryEventHandler.add(new DbHistoryEventHandler());
    configuration.setHistoryEventHandler(compositeHistoryEventHandler);
    
  }
}
