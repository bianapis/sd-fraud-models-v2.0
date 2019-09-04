package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTestingUpdateInputModelTestingInstanceRecordFraudModelTestResult
 */
public class BQTestingUpdateInputModelTestingInstanceRecordFraudModelTestResult   {
  private String fraudModelTestingTaskReference = null;

  private Object fraudModelTestingTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a type of testing activity 
   * @return fraudModelTestingTaskReference
  **/

  public String getFraudModelTestingTaskReference() {
    return fraudModelTestingTaskReference;
  }

  public void setFraudModelTestingTaskReference(String fraudModelTestingTaskReference) {
    this.fraudModelTestingTaskReference = fraudModelTestingTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record of work products used for this testing activity 
   * @return fraudModelTestingTaskRecord
  **/

  public Object getFraudModelTestingTaskRecord() {
    return fraudModelTestingTaskRecord;
  }

  public void setFraudModelTestingTaskRecord(Object fraudModelTestingTaskRecord) {
    this.fraudModelTestingTaskRecord = fraudModelTestingTaskRecord;
  }


}

