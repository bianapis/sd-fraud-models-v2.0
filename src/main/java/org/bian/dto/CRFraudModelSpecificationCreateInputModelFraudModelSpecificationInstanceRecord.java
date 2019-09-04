package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudModelSpecificationCreateInputModelFraudModelSpecificationInstanceRecordFraudModelDeployment;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationCreateInputModelFraudModelSpecificationInstanceRecord
 */
public class CRFraudModelSpecificationCreateInputModelFraudModelSpecificationInstanceRecord   {
  private String fraudModelType = null;

  private String fraudModelPurpose = null;

  private CRFraudModelSpecificationCreateInputModelFraudModelSpecificationInstanceRecordFraudModelDeployment fraudModelDeployment = null;

  private String fraudModelStatus = null;

  private String fraudModelUsage = null;

  private String fraudModelImpact = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the model that clarifies the intended analysis/insights provided 
   * @return fraudModelPurpose
  **/

  public String getFraudModelPurpose() {
    return fraudModelPurpose;
  }

  public void setFraudModelPurpose(String fraudModelPurpose) {
    this.fraudModelPurpose = fraudModelPurpose;
  }


  /**
   * Get fraudModelDeployment
   * @return fraudModelDeployment
  **/

  public CRFraudModelSpecificationCreateInputModelFraudModelSpecificationInstanceRecordFraudModelDeployment getFraudModelDeployment() {
    return fraudModelDeployment;
  }

  public void setFraudModelDeployment(CRFraudModelSpecificationCreateInputModelFraudModelSpecificationInstanceRecordFraudModelDeployment fraudModelDeployment) {
    this.fraudModelDeployment = fraudModelDeployment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The operational and development status of the model (e.g. under development, available, under review)  
   * @return fraudModelStatus
  **/

  public String getFraudModelStatus() {
    return fraudModelStatus;
  }

  public void setFraudModelStatus(String fraudModelStatus) {
    this.fraudModelStatus = fraudModelStatus;
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


}

