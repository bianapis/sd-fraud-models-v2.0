package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceReportRecord
 */
public class CRFraudModelSpecificationRetrieveOutputModelFraudModelSpecificationInstanceReportRecord   {
  private String fraudModelSpecificationInstanceReportData = null;

  private String fraudModelSpecificationInstanceReportType = null;

  private Object fraudModelSpecificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return fraudModelSpecificationInstanceReportData
  **/

  public String getFraudModelSpecificationInstanceReportData() {
    return fraudModelSpecificationInstanceReportData;
  }

  public void setFraudModelSpecificationInstanceReportData(String fraudModelSpecificationInstanceReportData) {
    this.fraudModelSpecificationInstanceReportData = fraudModelSpecificationInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fraudModelSpecificationInstanceReportType
  **/

  public String getFraudModelSpecificationInstanceReportType() {
    return fraudModelSpecificationInstanceReportType;
  }

  public void setFraudModelSpecificationInstanceReportType(String fraudModelSpecificationInstanceReportType) {
    this.fraudModelSpecificationInstanceReportType = fraudModelSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return fraudModelSpecificationInstanceReport
  **/

  public Object getFraudModelSpecificationInstanceReport() {
    return fraudModelSpecificationInstanceReport;
  }

  public void setFraudModelSpecificationInstanceReport(Object fraudModelSpecificationInstanceReport) {
    this.fraudModelSpecificationInstanceReport = fraudModelSpecificationInstanceReport;
  }


}

