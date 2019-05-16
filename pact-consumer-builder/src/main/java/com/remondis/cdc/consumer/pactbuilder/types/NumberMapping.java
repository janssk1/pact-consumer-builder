package com.remondis.cdc.consumer.pactbuilder.types;

import com.remondis.cdc.consumer.pactbuilder.PactDslModifier;

import au.com.dius.pact.consumer.dsl.PactDslJsonBody;

public class NumberMapping implements PactDslModifier<Number> {

  @Override
  public PactDslJsonBody apply(PactDslJsonBody pactDslJsonBody, String fieldName, Number fieldValue) {
    return pactDslJsonBody.numberType(fieldName, fieldValue);
  }

}
