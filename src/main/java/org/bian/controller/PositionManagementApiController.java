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
import org.bian.annotation.functionalpattern.Monitor;

@BianRestController
public class PositionManagementApiController {

	@Autowired
	PositionManagementApiService service;
	
	@Monitor.Activate
	public BianResponse<SDPositionManagementActivateOutputModel> activate(@RequestBody BianRequest<SDPositionManagementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Monitor.Configure
	public BianResponse<SDPositionManagementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDPositionManagementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Control
	public BianResponse<CRFinancialPositionStateControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFinancialPositionStateControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Feedback
	public BianResponse<SDPositionManagementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDPositionManagementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Monitor.Initiate
	public BianResponse<CRFinancialPositionStateInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRFinancialPositionStateInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionapplication")
	@Monitor.Initiate
	public BianResponse<BQTransactionApplicationInitiateOutputModel> initiateTransactionapplication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTransactionApplicationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateTransactionapplication(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("trialtransaction")
	@Monitor.Initiate
	public BianResponse<BQTrialTransactionInitiateOutputModel> initiateTrialtransaction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTrialTransactionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateTrialtransaction(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionapplication")
	@Monitor.Retrieve
	public BianResponse<BQTransactionApplicationRetrieveOutputModel> retrieveTransactionapplication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTransactionapplication(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("trialtransaction")
	@Monitor.Retrieve
	public BianResponse<BQTrialTransactionRetrieveOutputModel> retrieveTrialtransaction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTrialtransaction(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Monitor.Retrieve
	public BianResponse<CRFinancialPositionStateRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Monitor.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Monitor.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Monitor.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Monitor.RetrieveSD
	public BianResponse<SDPositionManagementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Monitor.Update
	public BianResponse<CRFinancialPositionStateUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFinancialPositionStateUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionapplication")
	@Monitor.Update
	public BianResponse<BQTransactionApplicationUpdateOutputModel> updateTransactionapplication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransactionApplicationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTransactionapplication(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("trialtransaction")
	@Monitor.Update
	public BianResponse<BQTrialTransactionUpdateOutputModel> updateTrialtransaction(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTrialTransactionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTrialtransaction(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
