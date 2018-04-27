package com.camunda.demo.insuranceapplication.configuration;

import org.camunda.bpm.engine.impl.history.handler.CompositeHistoryEventHandler;
import org.camunda.bpm.engine.impl.history.handler.HistoryEventHandler;

import java.util.List;

/**
 * @author Denis Marques
 */
public class MyCompositeHistoryEventHandler extends CompositeHistoryEventHandler {
    
    public void setHistoryEventHandler(List<HistoryEventHandler> heh) {
        heh.forEach(item -> {
            System.out.println(item.getClass().toString());
            super.add(item);
        });
    }
}
