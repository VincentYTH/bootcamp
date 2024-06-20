package com.bootcamp.project.project_yahoo_finance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TSTOCK_QUOTE_YAHOO")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StockEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private double bid;
  private double ask;
  private long bidSize;
  private long askSize;
  private double regularMarketChangePercent;
  private double regularMarketPrice;
  private String symbol;
  private String type;
  private String apiDateTime;
  private String marketTimeInNormalTimeStamp;
  private long regularMarketUnix;

  // private String language;
  // private String region;
  // private String quoteType;
  // private String typeDisp;
  // private String quoteSourceName;
  // private boolean triggerable;
  // private String customPriceAlertConfidence;
  // private boolean hasPrePostMarketData;
  // private long firstTradeDateMilliseconds;
  // private long priceHint;
  // private double regularMarketChange;
  // private double regularMarketDayHigh;
  // private String regularMarketDayRange;
  // private double regularMarketDayLow;
  // private long regularMarketVolume;
  // private double regularMarketPreviousClose;
  // private String fullExchangeName;
  // private String financialCurrency;
  // private double regularMarketOpen;
  // private long averageDailyVolume3Month;
  // private long averageDailyVolume10Day;
  // private double fiftyTwoWeekLowChange;
  // private double fiftyTwoWeekLowChangePercent;
  // private String fiftyTwoWeekRange;
  // private double fiftyTwoWeekHighChange;
  // private double fiftyTwoWeekHighChangePercent;
  // private double fiftyTwoWeekLow;
  // private double fiftyTwoWeekHigh;
  // private double fiftyTwoWeekChangePercent;
  // private long earningsTimestamp;
  // private long earningsTimestampStart;
  // private long earningsTimestampEnd;
  // private long earningsCallTimestampStart;
  // private long earningsCallTimestampEnd;
  // private boolean isEarningsDateEstimate;
  // private double trailingAnnualDividendRate;
  // private double trailingPE;
  // private double dividendRate;
  // private double trailingAnnualDividendYield;
  // private double dividendYield;
  // private double epsTrailingTwelveMonths;
  // private double epsForward;
  // private double epsCurrentYear;
  // private double priceEpsCurrentYear;
  // private long sharesOutstanding;
  // private double bookValue;
  // private double fiftyDayAverage;
  // private double boofiftyDayAverageChangekValue;
  // private double fiftyDayAverageChangePercent;
  // private double twoHundredDayAverage;
  // private double twoHundredDayAverageChange;
  // private double twoHundredDayAverageChangePercent;
  // private double marketCap;
  // private double forwardPE;
  // private double priceToBook;
  // private long sourceInterval;
  // private long exchangeDataDelayedBy;
  // private String averageAnalystRating;
  // private boolean tradeable;
  // private boolean cryptoTradeable;
  // private String currency;
  // private String marketState;
  // private String exchange;
  // private String shortName;
  // private String longName;
  // private String messageBoardId;
  // private String exchangeTimezoneName;
  // private String exchangeTimezoneShortName;
  // private long gmtOffSetMilliseconds;
  // private String market;
  // private boolean esgPopulated;
}
