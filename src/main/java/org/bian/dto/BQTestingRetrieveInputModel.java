package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingRetrieveInputModelTestingInstanceAnalysis;
import org.bian.dto.BQTestingRetrieveInputModelTestingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTestingRetrieveInputModel
 */
public class BQTestingRetrieveInputModel   {
  private Object testingRetrieveActionTaskRecord = null;

  private String testingRetrieveActionRequest = null;

  private BQTestingRetrieveInputModelTestingInstanceReport testingInstanceReport = null;

  private BQTestingRetrieveInputModelTestingInstanceAnalysis testingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return testingRetrieveActionTaskRecord
  **/

  public Object getTestingRetrieveActionTaskRecord() {
    return testingRetrieveActionTaskRecord;
  }

  public void setTestingRetrieveActionTaskRecord(Object testingRetrieveActionTaskRecord) {
    this.testingRetrieveActionTaskRecord = testingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return testingRetrieveActionRequest
  **/

  public String getTestingRetrieveActionRequest() {
    return testingRetrieveActionRequest;
  }

  public void setTestingRetrieveActionRequest(String testingRetrieveActionRequest) {
    this.testingRetrieveActionRequest = testingRetrieveActionRequest;
  }


  /**
   * Get testingInstanceReport
   * @return testingInstanceReport
  **/

  public BQTestingRetrieveInputModelTestingInstanceReport getTestingInstanceReport() {
    return testingInstanceReport;
  }

  public void setTestingInstanceReport(BQTestingRetrieveInputModelTestingInstanceReport testingInstanceReport) {
    this.testingInstanceReport = testingInstanceReport;
  }


  /**
   * Get testingInstanceAnalysis
   * @return testingInstanceAnalysis
  **/

  public BQTestingRetrieveInputModelTestingInstanceAnalysis getTestingInstanceAnalysis() {
    return testingInstanceAnalysis;
  }

  public void setTestingInstanceAnalysis(BQTestingRetrieveInputModelTestingInstanceAnalysis testingInstanceAnalysis) {
    this.testingInstanceAnalysis = testingInstanceAnalysis;
  }


}

