package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceAnalysis
 */
public class CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceAnalysis   {
  private String fraudModelSpecificationInstanceAnalysisData = null;

  private String fraudModelSpecificationInstanceAnalysisReportType = null;

  private Object fraudModelSpecificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return fraudModelSpecificationInstanceAnalysisData
  **/

  public String getFraudModelSpecificationInstanceAnalysisData() {
    return fraudModelSpecificationInstanceAnalysisData;
  }

  public void setFraudModelSpecificationInstanceAnalysisData(String fraudModelSpecificationInstanceAnalysisData) {
    this.fraudModelSpecificationInstanceAnalysisData = fraudModelSpecificationInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fraudModelSpecificationInstanceAnalysisReportType
  **/

  public String getFraudModelSpecificationInstanceAnalysisReportType() {
    return fraudModelSpecificationInstanceAnalysisReportType;
  }

  public void setFraudModelSpecificationInstanceAnalysisReportType(String fraudModelSpecificationInstanceAnalysisReportType) {
    this.fraudModelSpecificationInstanceAnalysisReportType = fraudModelSpecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return fraudModelSpecificationInstanceAnalysisReport
  **/

  public Object getFraudModelSpecificationInstanceAnalysisReport() {
    return fraudModelSpecificationInstanceAnalysisReport;
  }

  public void setFraudModelSpecificationInstanceAnalysisReport(Object fraudModelSpecificationInstanceAnalysisReport) {
    this.fraudModelSpecificationInstanceAnalysisReport = fraudModelSpecificationInstanceAnalysisReport;
  }


}

