package ltd.kaizo.realestatemanager.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004\u00a8\u0006\f"}, d2 = {"Lltd/kaizo/realestatemanager/utils/CurrencyUtils;", "", "()V", "convertDollarToEuro", "", "dollars", "convertEuroToDollar", "", "euros", "formatNumberFromCurrency", "", "number", "app_debug"})
public final class CurrencyUtils {
    public static final ltd.kaizo.realestatemanager.utils.CurrencyUtils INSTANCE = null;
    
    /**
     * * Conversion d'un prix d'un bien immobilier (Dollars vers Euros)
     *     * NOTE : NE PAS SUPPRIMER, A MONTRER DURANT LA SOUTENANCE
     *     * @param dollars
     *     * @return
     */
    public final int convertDollarToEuro(int dollars) {
        return 0;
    }
    
    public final int convertEuroToDollar(int euros) {
        return 0;
    }
    
    public final double convertEuroToDollar(double euros) {
        return 0.0;
    }
    
    /**
     * * take a number and return a formatted string
     *     * with currency
     *     * € = 1 000 €      $ = $1,000
     *     * @param number to convert
     *     * @return string
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatNumberFromCurrency(int number) {
        return null;
    }
    
    /**
     * * take a number and return a formatted string
     *     * with currency
     *     * € = 1 000,00 €      $ = $1,000.00
     *     * @param number to convert
     *     * @return string
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatNumberFromCurrency(double number) {
        return null;
    }
    
    private CurrencyUtils() {
        super();
    }
}