package tracker.covidtracker;

enum CountryCode
{
	 AF, //Afghanistan
	 AL, //Albania
	 DZ, //Algeria
	 AD, //Andorra
	 AO, //Angola
	 AI, //Anguilla
	 AG, //Antigua and Barbuda
	 AR, //Argentina
	 AM, //Armenia
	 AW, //Aruba
	 AU, //Australia
	 AT, //Austria
	 AZ, //Azerbaijan
	 BS, //Bahamas
	 BH, //Bahrain
	 BD, //Bangladesh
	 BB, //Barbados
	 BY, //Belarus
	 BE, //Belgium
	 BZ, //Belize
	 BJ, //Benin
	 BM, //Bermuda
	 BT, //Bhutan
	 BO, //Boliva (Plurinational State of)
	 BQ, //Bonaire, Sint Eustatius and Saba
	 BA, //Bosnia and Herzegovina
	 BW, //Botswana
	 BR, //Brazil
	 VG, //British Virgin Islands
	 BN, //Brunei Darussalam
	 BG, //Bulgaria
	 BF, //Burkina Faso
	 BI, //Burundi
	 CV, //Cabo Verde
	 KH, //Cambodia
	 CM, //Cameroon
	 CA, //Canada
	 KY, //Cayman Islands
	 CF, //Central African Republic
	 TD, //Chad
	 CL, //Chile
	 CN, //China
	 CO, //Colombia
	 KM, //Comoros
	 CG, //Congo
	 CR, //Costa Rica
	 CI, //Cote d'Ivoire
	 HR, //Croatia
	 CU, //Cuba
	 CW, //Curacao
	 CY, //Cyrpus
	 CZ, //Czechia
	 CD, //Democratic Republic of the Congo
	 DK, //Denmark
	 DJ, //Djibouti
	 DM, //Dominica
	 DO, //Dominican Republic
	 EC, //Ecuador
	 EG, //Egypt
	 SV, //El Salvador
	 GQ, //Equatorial Guinea
	 ER, //Eritrea
	 EE, //Estonia
	 SZ, //Eswatini
	 ET, //Ethiopia
	 FK, //Falkland Islands (Malvinas)
	 FO, //Faroe Islands
	 FJ, //Fiji
	 FI, //Finland
	 FR, //France
	 GF, //French Guiana
	 PF, //French Polynesia
	 GA, //Gabon
	 GM, //Gambia
	 GE, //Georgia
	 DE, //Germany
	 GH, //Ghana
	 GI, //Gibraltar
	 GR, //Greece
	 GL, //Greenland
	 GD, //Grenada
	 GP, //Guadeloupe
	 GU, //Guam
	 GT, //Guatemala
	 GG, //Guernsey
	 GN, //Guinea
	 GW, //Guinea-Bissau
	 GY, //Guyana
	 HT, //Haiti
	 VA, //Holy See
	 HN, //Honduras
	 HU, //Hungary
	 IS, //Iceland
	 IN, //India
	 ID, //Indonesia
	 IR, //Iran (Islamic Republic of)
	 IQ, //Iraq
	 IE, //Ireland
	 IM, //Isle of Man
	 IL, //Israel
	 IT, //Italy
	 JM, //Jamaica
	 JP, //Japan
	 JE, //Jersey
	 JO, //Jordan
	 KZ, //Kazakhstan
	 KE, //Kenya
	 XK, //Kosovo
	 KW, //Kuwait
	 KG, //Kyrgyzstan
	 LA, //Lao People's Democratic Republic
	 LV, //Latvia
	 LB, //Lebanon
	 LS, //Lesotho
	 LR, //Liberia
	 LY, //Libya
	 LI, //Liechtenstein
	 LT, //Lithuania
	 LU, //Luxembourg
	 MG, //Madagascar
	 MW, //Malawi
	 MY, //Malaysia
	 MV, //Maldives
	 ML, //Mali
	 MT, //Malta
	 MQ, //Martinique
	 MR, //Mauritania
	 MU, //Mauritius
	 YT, //Mayotte
	 MX, //Mexico
	 MC, //Monaco
	 MN, //Mongolia
	 ME, //Montenegro
	 MS, //Montserrat
	 MA, //Morocco
	 MZ, //Mozambique
	 MM, //Myanmar
	 NA, //Namibia
	 NP, //Nepal
	 NL, //Netherlands
	 NC, //New Caledonia
	 NZ, //New Zealand
	 NI, //Nicaragua
	 NE, //Niger
	 NG, //Nigeria
	 MK, //North Macedonia
	 MP, //Northern Mariana Islands (Commonwealth of the)
	 NO, //Norway
	 PS, //occupied Palestinian territory, including east Jerusalem
	 OM, //Oman
	 ZZZ,//OTHER
	 PK, //Pakistan
	 PA, //Panama
	 PG, //Papua New Guinea
	 PY, //Paraguay
	 PE, //Peru
	 PH, //Philippines
	 PL, //Poland
	 PT, //Portugal
	 PR, //Puerto Rico
	 QA, //Qatar
	 KR, //Republic of Korea
	 MD, //Republic of Moldova
	 RE, //Reunion
	 RO, //Romania
	 RU, //Russian Federation
	 RW, //Rwanda
	 BL, //Saint Barthelemy
	 KN, //Saint Kitts and Nevis
	 LC, //Saint Lucia
	 MF, //Saint Martin
	 PM, //Saint Pierre and Miquelon
	 VC, //Saint Vincent and the Grenadiens
	 SM, //San Marino
	 ST, //Sao Tome and Principe
	 SA, //Saudi Arabia
	 SN, //Senegal
	 RS, //Serbia
	 SC, //Seychelles
	 SL, //Sierra Leone
	 SG, //Singapore
	 SX, //Sint Maarten
	 SK, //Slovakia
	 SI, //Slovenia
	 SO, //Somalia
	 ZA, //South Africa
	 SS, //South Sudan
	 ES, //Spain
	 LK, //Sri Lanka
	 SD, //Sudan
	 SR, //Suriname
	 SE, //Sweden
	 CH, //Switzerland
	 SY, //Syrian Arab Republic
	 TJ, //Tajikistan
	 TH, //Thailand
	 GB, //United Kingdom
	 TL, //Timor-Leste
	 TG, //Togo
	 TT, //Trinidad and Tobago
	 TN, //Tunisia
	 TR, //Turkey
	 TC, //Turks and Caicos Islands
	 UG, //Uganda
	 UA, //Ukraine
	 AE, //United Arab Emirates
	 TZ, //United Republic of Tanzania
	 US, //United States of America
	 VI, //United States Virgin Islands
	 UY, //Uruguay
	 UZ, //Uzbekistan
	 VE, //Venezuela (Bolivarian Republic of)
	 VN, //Viet Nam
	 YE, //Yemen
	 ZM, //Zambia
	 ZW; //Zimbabwe
}

enum Country
{
	 Afghanistan,
	 Albania,
	 Algeria,
	 Andorra,
	 Angola,
	 Anguilla,
	 Antigua_and_Barbuda,
	 Argentina,
	 Armenia,
	 Aruba,
	 Australia,
	 Austria,
	 Azerbaijan,
	 Bahamas,
	 Bahrain,
	 Bangladesh,
	 Barbados,
	 Belarus,
	 Belgium,
	 Belize,
	 Benin,
	 Bermuda,
	 Bhutan,
	 Plurinational_State_of_Bolivia,
	 Bonaire$_Sint_Eustatius_and_Saba, //!
	 Bosnia_and_Herzegovina,
	 Botswana,
	 Brazil,
	 British_Virgin_Islands,
	 Brunei_Darussalam,
	 Bulgaria,
	 Burkina_Faso,
	 Burundi,
	 Cabo_Verde,
	 Cambodia,
	 Cameroon,
	 Canada,
	 Cayman_Islands,
	 Central_African_Republic,
	 Chad,
	 Chile,
	 China,
	 Colombia,
	 Comoros,
	 Congo,
	 Costa_Rica,
	 Cote_d$Ivoire, //!
	 Croatia,
	 Cuba,
	 Curacao,
	 Cyrpus,
	 Czechia,
	 Democratic_Republic_of_the_Congo,
	 Denmark,
	 Djibouti,
	 Dominica,
	 Dominican_Republic,
	 Ecuador,
	 Egypt,
	 El_Salvador,
	 Equatorial_Guinea,
	 Eritrea,
	 Estonia,
	 Eswatini,
	 Ethiopia,
	 Falkland_Islands,
	 Faroe_Islands,
	 Fiji,
	 Finland,
	 France,
	 French_Guiana,
	 French_Polynesia,
	 Gabon,
	 Gambia,
	 Georgia,
	 Germany,
	 Ghana,
	 Gibraltar,
	 Greece,
	 Greenland,
	 Grenada,
	 Guadeloupe,
	 Guam,
	 Guatemala,
	 Guernsey,
	 Guinea,
	 Guinea$Bissau, //!
	 Guyana,
	 Haiti,
	 Holy_See,
	 Honduras,
	 Hungary,
	 Iceland,
	 India,
	 Indonesia,
	 Islamic_Republic_of_Iran,
	 Iraq,
	 Ireland,
	 Isle_of_Man,
	 Israel,
	 Italy,
	 Jamaica,
	 Japan,
	 Jersey,
	 Jordan,
	 Kazakhstan,
	 Kenya,
	 Kosovo,
	 Kuwait,
	 Kyrgyzstan,
	 Lao_People$s_Democratic_Republic, //!
	 Latvia,
	 Lebanon,
	 Lesotho,
	 Liberia,
	 Libya,
	 Liechtenstein,
	 Lithuania,
	 Luxembourg,
	 Madagascar,
	 Malawi,
	 Malaysia,
	 Maldives,
	 Mali,
	 Malta,
	 Martinique,
	 Mauritania,
	 Mauritius,
	 Mayotte,
	 Mexico,
	 Monaco,
	 Mongolia,
	 Montenegro,
	 Montserrat,
	 Morocco,
	 Mozambique,
	 Myanmar,
	 Namibia,
	 Nepal,
	 Netherlands,
	 New_Caledonia,
	 New_Zealand,
	 Nicaragua,
	 Niger,
	 Nigeria,
	 North_Macedonia,
	 Commonwealth_of_the_Northern_Mariana_Islands,
	 Norway,
	 Occupied_Palestinian_territory_including_east_Jerusalem,
	 Oman,
	 Other_Countries,
	 Pakistan,
	 Panama,
	 Papua_New_Guinea,
	 Paraguay,
	 Peru,
	 Philippines,
	 Poland,
	 Portugal,
	 Puerto_Rico,
	 Qatar,
	 Republic_of_Korea,
	 Republic_of_Moldova,
	 Reunion,
	 Romania,
	 Russian_Federation,
	 Rwanda,
	 Saint_Barthelemy,
	 Saint_Kitts_and_Nevis,
	 Saint_Lucia,
	 Saint_Martin,
	 Saint_Pierre_and_Miquelon,
	 Saint_Vincent_and_the_Grenadiens,
	 San_Marino,
	 Sao_Tome_and_Principe,
	 Saudi_Arabia,
	 Senegal,
	 Serbia,
	 Seychelles,
	 Sierra_Leone,
	 Singapore,
	 Sint_Maarten,
	 Slovakia,
	 Slovenia,
	 Somalia,
	 South_Africa,
	 South_Sudan,
	 Spain,
	 Sri_Lanka,
	 Sudan,
	 Suriname,
	 Sweden,
	 Switzerland,
	 Syrian_Arab_Republic,
	 Tajikistan,
	 Thailand,
	 United_Kingdom,
	 Timor$Leste, //!
	 Togo,
	 Trinidad_and_Tobago,
	 Tunisia,
	 Turkey,
	 Turks_and_Caicos_Islands,
	 Uganda,
	 Ukraine,
	 United_Arab_Emirates,
	 United_Republic_of_Tanzania,
	 United_States_of_America,
	 United_States_Virgin_Islands,
	 Uruguay,
	 Uzbekistan,
	 Bolivarian_Republic_of_Venezuela,
	 Viet_Nam,
	 Yemen,
	 Zambia,
	 Zimbabwe;
}
