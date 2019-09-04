package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalRequirementsRetrieveInputModelFunctionalRequirementsInstanceAnalysis;
import org.bian.dto.BQFunctionalRequirementsRetrieveInputModelFunctionalRequirementsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRetrieveInputModel
 */
public class BQFunctionalRequirementsRetrieveInputModel   {
  private Object functionalRequirementsRetrieveActionTaskRecord = null;

  private String functionalRequirementsRetrieveActionRequest = null;

  private BQFunctionalRequirementsRetrieveInputModelFunctionalRequirementsInstanceReport functionalRequirementsInstanceReport = null;

  private BQFunctionalRequirementsRetrieveInputModelFunctionalRequirementsInstanceAnalysis functionalRequirementsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return functionalRequirementsRetrieveActionTaskRecord
  **/

  public Object getFunctionalRequirementsRetrieveActionTaskRecord() {
    return functionalRequirementsRetrieveActionTaskRecord;
  }

  public void setFunctionalRequirementsRetrieveActionTaskRecord(Object functionalRequirementsRetrieveActionTaskRecord) {
    this.functionalRequirementsRetrieveActionTaskRecord = functionalRequirementsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return functionalRequirementsRetrieveActionRequest
  **/

  public String getFunctionalRequirementsRetrieveActionRequest() {
    return functionalRequirementsRetrieveActionRequest;
  }

  public void setFunctionalRequirementsRetrieveActionRequest(String functionalRequirementsRetrieveActionRequest) {
    this.functionalRequirementsRetrieveActionRequest = functionalRequirementsRetrieveActionRequest;
  }


  /**
   * Get functionalRequirementsInstanceReport
   * @return functionalRequirementsInstanceReport
  **/

  public BQFunctionalRequirementsRetrieveInputModelFunctionalRequirementsInstanceReport getFunctionalRequirementsInstanceReport() {
    return functionalRequirementsInstanceReport;
  }

  public void setFunctionalRequirementsInstanceReport(BQFunctionalRequirementsRetrieveInputModelFunctionalRequirementsInstanceReport functionalRequirementsInstanceReport) {
    this.functionalRequirementsInstanceReport = functionalRequirementsInstanceReport;
  }


  /**
   * Get functionalRequirementsInstanceAnalysis
   * @return functionalRequirementsInstanceAnalysis
  **/

  public BQFunctionalRequirementsRetrieveInputModelFunctionalRequirementsInstanceAnalysis getFunctionalRequirementsInstanceAnalysis() {
    return functionalRequirementsInstanceAnalysis;
  }

  public void setFunctionalRequirementsInstanceAnalysis(BQFunctionalRequirementsRetrieveInputModelFunctionalRequirementsInstanceAnalysis functionalRequirementsInstanceAnalysis) {
    this.functionalRequirementsInstanceAnalysis = functionalRequirementsInstanceAnalysis;
  }


}

