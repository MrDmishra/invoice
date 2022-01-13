package com.test.test.service;

import java.util.List;

import com.test.test.entity.Invoice;

public interface IExcelDataService {
    List<Invoice> getExcelDataAsList();

    int saveExcelData(List<Invoice> invoices);
}
