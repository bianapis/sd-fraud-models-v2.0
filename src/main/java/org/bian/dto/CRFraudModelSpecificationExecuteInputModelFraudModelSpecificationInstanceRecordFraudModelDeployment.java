package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudModelSpecificationExecuteInputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration;

import javax.validation.Valid;
  
/**
 * CRFraudModelSpecificationExecuteInputModelFraudModelSpecificationInstanceRecordFraudModelDeployment
 */
public class CRFraudModelSpecificationExecuteInputModelFraudModelSpecificationInstanceRecordFraudModelDeployment   {
  private String employeeBusinessUnitReference = null;

  private CRFraudModelSpecificationExecuteInputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration fraudModelDeploymentConfiguration = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business units where the model is deployed and in use 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * Get fraudModelDeploymentConfiguration
   * @return fraudModelDeploymentConfiguration
  **/

  public CRFraudModelSpecificationExecuteInputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration getFraudModelDeploymentConfiguration() {
    return fraudModelDeploymentConfiguration;
  }

  public void setFraudModelDeploymentConfiguration(CRFraudModelSpecificationExecuteInputModelFraudModelSpecificationInstanceRecordFraudModelDeploymentFraudModelDeploymentConfiguration fraudModelDeploymentConfiguration) {
    this.fraudModelDeploymentConfiguration = fraudModelDeploymentConfiguration;
  }


}

