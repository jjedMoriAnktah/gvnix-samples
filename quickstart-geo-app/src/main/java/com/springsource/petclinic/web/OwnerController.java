package com.springsource.petclinic.web;
import com.springsource.petclinic.domain.Owner;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springsource.petclinic.domain.OwnerBatchService;
import org.gvnix.addon.web.mvc.batch.GvNIXWebJpaBatch;
import org.gvnix.addon.web.mvc.jquery.GvNIXWebJQuery;
import org.gvnix.addon.datatables.GvNIXDatatables;
import org.gvnix.web.report.roo.addon.GvNIXReports;
import org.gvnix.addon.geo.GvNIXWebEntityMapLayer;

@RequestMapping("/owners")
@Controller
@RooWebScaffold(path = "owners", formBackingObject = Owner.class)
@GvNIXWebJpaBatch(service = OwnerBatchService.class)
@GvNIXWebJQuery
@GvNIXDatatables(ajax = true, detailFields = { "pets", "vets" })
@GvNIXReports({ "report_owners|pdf" })
@GvNIXWebEntityMapLayer
public class OwnerController {
}
