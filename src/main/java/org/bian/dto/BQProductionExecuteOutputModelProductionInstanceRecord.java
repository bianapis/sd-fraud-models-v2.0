package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionExecuteOutputModelProductionInstanceRecord
 */
public class BQProductionExecuteOutputModelProductionInstanceRecord   {
  private String fraudModelOperationalRequirements = null;

  private String fraudModelAllowedUsage = null;

  private String fraudModelUsageGuidelines = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Specification of the operational and technical requirements  
   * @return fraudModelOperationalRequirements
  **/

  public String getFraudModelOperationalRequirements() {
    return fraudModelOperationalRequirements;
  }

  public void setFraudModelOperationalRequirements(String fraudModelOperationalRequirements) {
    this.fraudModelOperationalRequirements = fraudModelOperationalRequirements;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines rules and suitability for model usage 
   * @return fraudModelAllowedUsage
  **/

  public String getFraudModelAllowedUsage() {
    return fraudModelAllowedUsage;
  }

  public void setFraudModelAllowedUsage(String fraudModelAllowedUsage) {
    this.fraudModelAllowedUsage = fraudModelAllowedUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Provides guidance on the use of the model 
   * @return fraudModelUsageGuidelines
  **/

  public String getFraudModelUsageGuidelines() {
    return fraudModelUsageGuidelines;
  }

  public void setFraudModelUsageGuidelines(String fraudModelUsageGuidelines) {
    this.fraudModelUsageGuidelines = fraudModelUsageGuidelines;
  }


}

