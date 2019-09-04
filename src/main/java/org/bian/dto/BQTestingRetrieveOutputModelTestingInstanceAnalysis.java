package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTestingRetrieveOutputModelTestingInstanceAnalysis
 */
public class BQTestingRetrieveOutputModelTestingInstanceAnalysis   {
  private Object testingInstanceAnalysisRecord = null;

  private String testingInstanceAnalysisReportType = null;

  private String testingInstanceAnalysisParameters = null;

  private Object testingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return testingInstanceAnalysisRecord
  **/

  public Object getTestingInstanceAnalysisRecord() {
    return testingInstanceAnalysisRecord;
  }

  public void setTestingInstanceAnalysisRecord(Object testingInstanceAnalysisRecord) {
    this.testingInstanceAnalysisRecord = testingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return testingInstanceAnalysisReportType
  **/

  public String getTestingInstanceAnalysisReportType() {
    return testingInstanceAnalysisReportType;
  }

  public void setTestingInstanceAnalysisReportType(String testingInstanceAnalysisReportType) {
    this.testingInstanceAnalysisReportType = testingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return testingInstanceAnalysisParameters
  **/

  public String getTestingInstanceAnalysisParameters() {
    return testingInstanceAnalysisParameters;
  }

  public void setTestingInstanceAnalysisParameters(String testingInstanceAnalysisParameters) {
    this.testingInstanceAnalysisParameters = testingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return testingInstanceAnalysisReport
  **/

  public Object getTestingInstanceAnalysisReport() {
    return testingInstanceAnalysisReport;
  }

  public void setTestingInstanceAnalysisReport(Object testingInstanceAnalysisReport) {
    this.testingInstanceAnalysisReport = testingInstanceAnalysisReport;
  }


}

