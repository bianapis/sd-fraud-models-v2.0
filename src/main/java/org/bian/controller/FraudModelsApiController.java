/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Design;

@BianRestController
public class FraudModelsApiController {

	@Autowired
	FraudModelsApiService service;
	
	@Design.Activate
	public BianResponse<SDFraudModelsActivateOutputModel> activate(@RequestBody BianRequest<SDFraudModelsActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("functionalrequirements")
	@Design.Capture
	public BianResponse<BQFunctionalRequirementsCaptureOutputModel> captureFunctionalrequirements(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFunctionalRequirementsCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureFunctionalrequirements(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Design.Configure
	public BianResponse<SDFraudModelsConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDFraudModelsConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Design.Create
	public BianResponse<CRFraudModelSpecificationCreateOutputModel> create(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRFraudModelSpecificationCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.create(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("functionalrequirements")
	@Design.Exchange
	public BianResponse<BQFunctionalRequirementsExchangeOutputModel> exchangeFunctionalrequirements(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFunctionalRequirementsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeFunctionalrequirements(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("testing")
	@Design.Exchange
	public BianResponse<BQTestingExchangeOutputModel> exchangeTesting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTestingExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeTesting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("production")
	@Design.Execute
	public BianResponse<BQProductionExecuteOutputModel> executeProduction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeProduction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Design.Execute
	public BianResponse<CRFraudModelSpecificationExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFraudModelSpecificationExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Feedback
	public BianResponse<SDFraudModelsFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDFraudModelsFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("functionalrequirements")
	@Design.Request
	public BianResponse<BQFunctionalRequirementsRequestOutputModel> requestFunctionalrequirements(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFunctionalRequirementsRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestFunctionalrequirements(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("production")
	@Design.Request
	public BianResponse<BQProductionRequestOutputModel> requestProduction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestProduction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Design.Request
	public BianResponse<CRFraudModelSpecificationRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFraudModelSpecificationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("functionalrequirements")
	@Design.Retrieve
	public BianResponse<BQFunctionalRequirementsRetrieveOutputModel> retrieveFunctionalrequirements(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFunctionalrequirements(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("production")
	@Design.Retrieve
	public BianResponse<BQProductionRetrieveOutputModel> retrieveProduction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProduction(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("testing")
	@Design.Retrieve
	public BianResponse<BQTestingRetrieveOutputModel> retrieveTesting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTesting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Design.Retrieve
	public BianResponse<CRFraudModelSpecificationRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Design.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Design.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Design.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Design.RetrieveSD
	public BianResponse<SDFraudModelsRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@BQ("functionalrequirements")
	@Design.Update
	public BianResponse<BQFunctionalRequirementsUpdateOutputModel> updateFunctionalrequirements(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFunctionalRequirementsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFunctionalrequirements(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("testing")
	@Design.Update
	public BianResponse<BQTestingUpdateOutputModel> updateTesting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTestingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTesting(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
