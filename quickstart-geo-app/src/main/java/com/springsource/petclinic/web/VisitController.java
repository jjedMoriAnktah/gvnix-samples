package com.springsource.petclinic.web;
import com.springsource.petclinic.domain.Visit;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;
import com.springsource.petclinic.domain.VisitBatchService;
import org.gvnix.addon.web.mvc.batch.GvNIXWebJpaBatch;
import org.gvnix.addon.web.mvc.jquery.GvNIXWebJQuery;
import org.gvnix.addon.datatables.GvNIXDatatables;

@RequestMapping("/visits")
@Controller
@RooWebScaffold(path = "visits", formBackingObject = Visit.class)
@RooWebFinder
@GvNIXWebJpaBatch(service = VisitBatchService.class)
@GvNIXWebJQuery
@GvNIXDatatables(ajax = true, inlineEditing = true)
public class VisitController {
}
