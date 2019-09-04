package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceAnalysis
 */
public class BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceAnalysis   {
  private Object functionalRequirementsInstanceAnalysisRecord = null;

  private String functionalRequirementsInstanceAnalysisReportType = null;

  private String functionalRequirementsInstanceAnalysisParameters = null;

  private Object functionalRequirementsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return functionalRequirementsInstanceAnalysisRecord
  **/

  public Object getFunctionalRequirementsInstanceAnalysisRecord() {
    return functionalRequirementsInstanceAnalysisRecord;
  }

  public void setFunctionalRequirementsInstanceAnalysisRecord(Object functionalRequirementsInstanceAnalysisRecord) {
    this.functionalRequirementsInstanceAnalysisRecord = functionalRequirementsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return functionalRequirementsInstanceAnalysisReportType
  **/

  public String getFunctionalRequirementsInstanceAnalysisReportType() {
    return functionalRequirementsInstanceAnalysisReportType;
  }

  public void setFunctionalRequirementsInstanceAnalysisReportType(String functionalRequirementsInstanceAnalysisReportType) {
    this.functionalRequirementsInstanceAnalysisReportType = functionalRequirementsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return functionalRequirementsInstanceAnalysisParameters
  **/

  public String getFunctionalRequirementsInstanceAnalysisParameters() {
    return functionalRequirementsInstanceAnalysisParameters;
  }

  public void setFunctionalRequirementsInstanceAnalysisParameters(String functionalRequirementsInstanceAnalysisParameters) {
    this.functionalRequirementsInstanceAnalysisParameters = functionalRequirementsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return functionalRequirementsInstanceAnalysisReport
  **/

  public Object getFunctionalRequirementsInstanceAnalysisReport() {
    return functionalRequirementsInstanceAnalysisReport;
  }

  public void setFunctionalRequirementsInstanceAnalysisReport(Object functionalRequirementsInstanceAnalysisReport) {
    this.functionalRequirementsInstanceAnalysisReport = functionalRequirementsInstanceAnalysisReport;
  }


}

