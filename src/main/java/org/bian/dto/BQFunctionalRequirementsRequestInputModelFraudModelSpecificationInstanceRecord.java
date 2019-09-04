package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRequestInputModelFraudModelSpecificationInstanceRecord
 */
public class BQFunctionalRequirementsRequestInputModelFraudModelSpecificationInstanceRecord   {
  private String fraudModelType = null;

  private String fraudModelUsage = null;

  private String fraudModelImpact = null;

  private String fraudModelVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type or category of behavior model (e.g. Decision tree, Bayesian Linear Regression, Logistic Regression, Neural Network)) 
   * @return fraudModelType
  **/

  public String getFraudModelType() {
    return fraudModelType;
  }

  public void setFraudModelType(String fraudModelType) {
    this.fraudModelType = fraudModelType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Tracking deployment and usage frequency  
   * @return fraudModelUsage
  **/

  public String getFraudModelUsage() {
    return fraudModelUsage;
  }

  public void setFraudModelUsage(String fraudModelUsage) {
    this.fraudModelUsage = fraudModelUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Track reporting of the impact/accuracy of the model's insights 
   * @return fraudModelImpact
  **/

  public String getFraudModelImpact() {
    return fraudModelImpact;
  }

  public void setFraudModelImpact(String fraudModelImpact) {
    this.fraudModelImpact = fraudModelImpact;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Release version of available model plus version history as appropriate 
   * @return fraudModelVersion
  **/

  public String getFraudModelVersion() {
    return fraudModelVersion;
  }

  public void setFraudModelVersion(String fraudModelVersion) {
    this.fraudModelVersion = fraudModelVersion;
  }


}

