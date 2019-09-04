package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingUpdateInputModelTestingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTestingUpdateOutputModel
 */
public class BQTestingUpdateOutputModel   {
  private BQTestingUpdateInputModelTestingInstanceRecord testingInstanceRecord = null;

  private String testingUpdateActionTaskReference = null;

  private Object testingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get testingInstanceRecord
   * @return testingInstanceRecord
  **/

  public BQTestingUpdateInputModelTestingInstanceRecord getTestingInstanceRecord() {
    return testingInstanceRecord;
  }

  public void setTestingInstanceRecord(BQTestingUpdateInputModelTestingInstanceRecord testingInstanceRecord) {
    this.testingInstanceRecord = testingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return testingUpdateActionTaskReference
  **/

  public String getTestingUpdateActionTaskReference() {
    return testingUpdateActionTaskReference;
  }

  public void setTestingUpdateActionTaskReference(String testingUpdateActionTaskReference) {
    this.testingUpdateActionTaskReference = testingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return testingUpdateActionTaskRecord
  **/

  public Object getTestingUpdateActionTaskRecord() {
    return testingUpdateActionTaskRecord;
  }

  public void setTestingUpdateActionTaskRecord(Object testingUpdateActionTaskRecord) {
    this.testingUpdateActionTaskRecord = testingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

