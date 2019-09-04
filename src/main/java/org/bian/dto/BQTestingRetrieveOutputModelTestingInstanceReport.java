package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTestingRetrieveOutputModelTestingInstanceReport
 */
public class BQTestingRetrieveOutputModelTestingInstanceReport   {
  private Object testingInstanceReportRecord = null;

  private String testingInstanceReportType = null;

  private String testingInstanceReportParameters = null;

  private Object testingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return testingInstanceReportRecord
  **/

  public Object getTestingInstanceReportRecord() {
    return testingInstanceReportRecord;
  }

  public void setTestingInstanceReportRecord(Object testingInstanceReportRecord) {
    this.testingInstanceReportRecord = testingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return testingInstanceReportType
  **/

  public String getTestingInstanceReportType() {
    return testingInstanceReportType;
  }

  public void setTestingInstanceReportType(String testingInstanceReportType) {
    this.testingInstanceReportType = testingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return testingInstanceReportParameters
  **/

  public String getTestingInstanceReportParameters() {
    return testingInstanceReportParameters;
  }

  public void setTestingInstanceReportParameters(String testingInstanceReportParameters) {
    this.testingInstanceReportParameters = testingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return testingInstanceReport
  **/

  public Object getTestingInstanceReport() {
    return testingInstanceReport;
  }

  public void setTestingInstanceReport(Object testingInstanceReport) {
    this.testingInstanceReport = testingInstanceReport;
  }


}

