package com.xworkz.collection.collectionExample.charcoal;

import java.util.Comparator;

public class CharCoalPriceComparatorAsc implements Comparator<CharcoalDTO> {

    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
class CharCoalPriceComparatorDsc implements Comparator<CharcoalDTO> {

    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }
}
class CharCoalQuantityComparatorAsc implements Comparator<CharcoalDTO> {

    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Double.compare(o1.getQuantity(), o2.getQuantity());
    }
}

class CharCoalQuantityComparatorDsc implements Comparator<CharcoalDTO> {

    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Double.compare(o2.getQuantity(), o1.getQuantity());
    }
}
class CharCoalQualityComparatorAsc implements Comparator<CharcoalDTO> {

    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        int n=o1.getQuality().compareTo(o2.getQuality());
        return n;
    }
}
class CharCoalQualityComparatorDsc implements Comparator<CharcoalDTO> {

    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        int n=o2.getQuality().compareTo(o1.getQuality());
        return n;
    }
}

class CharCoalCompanyComparatorDsc implements Comparator<CharcoalDTO> {

    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        int n=o2.getCompany().compareTo(o1.getCompany());
        return n;
    }
}
class CharCoalCompanyComparatorAsc implements Comparator<CharcoalDTO> {

    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        int n=o1.getCompany().compareTo(o2.getCompany());
        return n;
    }
}

