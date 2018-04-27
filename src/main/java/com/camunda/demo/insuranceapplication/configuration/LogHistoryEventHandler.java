package com.camunda.demo.insuranceapplication.configuration;

import org.camunda.bpm.engine.impl.history.event.HistoryEvent;
import org.camunda.bpm.engine.impl.history.handler.HistoryEventHandler;

import java.util.List;

/**
 * @author Denis Marques
 */
public class LogHistoryEventHandler implements HistoryEventHandler {

    public LogHistoryEventHandler() {}
    
    @Override
    public void handleEvent(HistoryEvent historyEvent) {
        System.out.println("********************************handleEvent***************************************");
        System.out.println(historyEvent);
        System.out.println("**********************************************************************************");
    }
    
    @Override
    public void handleEvents(List<HistoryEvent> list) {
        System.out.println("*************************** handleEvent List *************************************");
        System.out.println(list);
        System.out.println("**********************************************************************************");
    }
}
