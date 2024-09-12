package com.ricka.princy.endpoint.event.consumer.model;

import com.ricka.princy.PojaGenerated;
import com.ricka.princy.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
