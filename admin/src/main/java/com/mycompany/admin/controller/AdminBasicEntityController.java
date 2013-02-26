/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mycompany.admin.controller;

import org.broadleafcommerce.openadmin.web.controller.entity.BroadleafAdminBasicEntityController;
import org.broadleafcommerce.openadmin.web.form.entity.EntityForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Andre Azzolini (apazzolini)
 */
@Controller
@RequestMapping("")
public class AdminBasicEntityController extends BroadleafAdminBasicEntityController {

    @Override
    @RequestMapping(value = "{sectionKey}", method = RequestMethod.GET)
    public String viewEntityList(HttpServletRequest request, HttpServletResponse response, Model model,
            @PathVariable String sectionKey) throws Exception {
        return super.viewEntityList(request, response, model, sectionKey);
    }

    @Override
    @RequestMapping(value = "{sectionKey}/add", method = RequestMethod.GET)
    public String viewAddEntityForm(HttpServletRequest request, HttpServletResponse response, Model model,
            @PathVariable String sectionKey,
            @RequestParam(defaultValue = "") String entityType) throws Exception {
        return super.viewAddEntityForm(request, response, model, sectionKey, entityType);
    }

    @Override
    @RequestMapping(value = "{sectionKey}/add", method = RequestMethod.POST)
    public String addEntity(HttpServletRequest request, HttpServletResponse response, Model model,
            @PathVariable String sectionKey,
            @ModelAttribute EntityForm entityForm, BindingResult result) throws Exception {
        return super.addEntity(request, response, model, sectionKey, entityForm, result);
    }

    @Override
    @RequestMapping(value = "{sectionKey}/{id}", method = RequestMethod.GET)
    public String viewEntityForm(HttpServletRequest request, HttpServletResponse response, Model model,
            @PathVariable String sectionKey,
            @PathVariable String id) throws Exception {
        return super.viewEntityForm(request, response, model, sectionKey, id);
    }

    @Override
    @RequestMapping(value = "{sectionKey}/{id}", method = RequestMethod.POST)
    public String saveEntity(HttpServletRequest request, HttpServletResponse response, Model model,
            @PathVariable String sectionKey,
            @PathVariable String id,
            @ModelAttribute EntityForm entityForm, BindingResult result) throws Exception {
        return super.saveEntity(request, response, model, sectionKey, id, entityForm, result);
    }

    @Override
    @RequestMapping(value = "{sectionKey}/{id}/{collectionField}/add", method = RequestMethod.GET)
    public String showAddCollectionItem(HttpServletRequest request, HttpServletResponse response, Model model,
            @PathVariable String sectionKey,
            @PathVariable String id,
            @PathVariable String collectionField) throws Exception {
        return super.showAddCollectionItem(request, response, model, sectionKey, id, collectionField);
    }

    @Override
    @RequestMapping(value = "{sectionKey}/{id}/{collectionField}/{collectionItemId}", method = RequestMethod.GET)
    public String showUpdateCollectionItem(HttpServletRequest request, HttpServletResponse response, Model model,
            @PathVariable String sectionKey,
            @PathVariable String id,
            @PathVariable String collectionField,
            @PathVariable String collectionItemId) throws Exception {
        return super.showUpdateCollectionItem(request, response, model, sectionKey, id, collectionField, collectionItemId);
    }

    @Override
    @RequestMapping(value = "{sectionKey}/{collectionField}/select", method = RequestMethod.GET)
    public String showSelectCollectionItem(HttpServletRequest request, HttpServletResponse response, Model model,
            @PathVariable String sectionKey,
            @PathVariable String collectionField) throws Exception {
        return super.showSelectCollectionItem(request, response, model, sectionKey, collectionField);
    }

    @Override
    @RequestMapping(value = "{sectionKey}/{id}/{collectionField}/add", method = RequestMethod.POST)
    public String addCollectionItem(HttpServletRequest request, HttpServletResponse response, Model model,
            @PathVariable String sectionKey,
            @PathVariable String id,
            @PathVariable String collectionField,
            @ModelAttribute EntityForm entityForm) throws Exception {
        return super.addCollectionItem(request, response, model, sectionKey, id, collectionField, entityForm);
    }

    @Override
    @RequestMapping(value = "{sectionKey}/{id}/{collectionField}/{collectionItemId}", method = RequestMethod.POST)
    public String updateCollectionItem(HttpServletRequest request, HttpServletResponse response, Model model,
            @PathVariable String sectionKey,
            @PathVariable String id,
            @PathVariable String collectionField,
            @PathVariable String collectionItemId,
            @ModelAttribute EntityForm entityForm) throws Exception {
        return super.updateCollectionItem(request, response, model, sectionKey, id, collectionField, collectionItemId,
                entityForm);
    }

    @Override
    @RequestMapping(value = "{sectionKey}/{id}/{collectionField}/{collectionItemId}/delete", method = RequestMethod.POST)
    public String removeCollectionItem(HttpServletRequest request, HttpServletResponse response, Model model,
            @PathVariable String sectionKey,
            @PathVariable String id,
            @PathVariable String collectionField,
            @PathVariable String collectionItemId) throws Exception {
        return super.removeCollectionItem(request, response, model, sectionKey, id, collectionField, collectionItemId);
    }

    @Override
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        super.initBinder(binder);
    }

}
