package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingUpdateInputModelTestingInstanceRecordFraudModelTestResult;

import javax.validation.Valid;
  
/**
 * BQTestingUpdateInputModelTestingInstanceRecord
 */
public class BQTestingUpdateInputModelTestingInstanceRecord   {
  private String fraudModelTestReference = null;

  private String fraudModelTestType = null;

  private String fraudModelTestHarnessReference = null;

  private BQTestingUpdateInputModelTestingInstanceRecordFraudModelTestResult fraudModelTestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a type of test 
   * @return fraudModelTestReference
  **/

  public String getFraudModelTestReference() {
    return fraudModelTestReference;
  }

  public void setFraudModelTestReference(String fraudModelTestReference) {
    this.fraudModelTestReference = fraudModelTestReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of test (e.g. unit, integration, load, user acceptance etc.) 
   * @return fraudModelTestType
  **/

  public String getFraudModelTestType() {
    return fraudModelTestType;
  }

  public void setFraudModelTestType(String fraudModelTestType) {
    this.fraudModelTestType = fraudModelTestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the testing environment used to apply the test 
   * @return fraudModelTestHarnessReference
  **/

  public String getFraudModelTestHarnessReference() {
    return fraudModelTestHarnessReference;
  }

  public void setFraudModelTestHarnessReference(String fraudModelTestHarnessReference) {
    this.fraudModelTestHarnessReference = fraudModelTestHarnessReference;
  }


  /**
   * Get fraudModelTestResult
   * @return fraudModelTestResult
  **/

  public BQTestingUpdateInputModelTestingInstanceRecordFraudModelTestResult getFraudModelTestResult() {
    return fraudModelTestResult;
  }

  public void setFraudModelTestResult(BQTestingUpdateInputModelTestingInstanceRecordFraudModelTestResult fraudModelTestResult) {
    this.fraudModelTestResult = fraudModelTestResult;
  }


}

