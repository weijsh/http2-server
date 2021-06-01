package com.capitek.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class Http2Controller {
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static int count = 0;

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().format(dtf));
        System.out.println(LocalDateTime.parse("2021-04-13 15:23:02", dtf));
        String msg = "{0}{1}{2}{3}{4}{5}{6}{7}{8}";
        String [] array = new String[]{"A","B","C","D","E","F","G","H","I",};
        String value = MessageFormat.format(msg, array);

        System.out.println(value);
    }






    @GetMapping(value = "udm")
    private String udm(HttpServletRequest request) throws IOException {
        String str = "{\n" +
                "    \"AMBRDW\": 300,\n" +
                "    \"AMBRDWUNIT\": \"Mbps\",\n" +
                "    \"AMBRMAXDL\": 2147483648,\n" +
                "    \"AMBRMAXDLUNIT\": \"bps\",\n" +
                "    \"AMBRMAXUP\": 157286400,\n" +
                "    \"AMBRMAXUPUNIT\": \"bps\",\n" +
                "    \"AMBRUP\": 100,\n" +
                "    \"AMBRUPUNIT\": \"Mbps\",\n" +
                "    \"APNDATALIST\": [\n" +
                "        {\n" +
                "            \"CNTXID\": 2,\n" +
                "            \"DEFAULT\": false,\n" +
                "            \"EPSAPNQOSTPLID\": 4\n" +
                "        },\n" +
                "        {\n" +
                "            \"CNTXID\": 4,\n" +
                "            \"DEFAULT\": false,\n" +
                "            \"EPSAPNQOSTPLID\": 99\n" +
                "        },\n" +
                "        {\n" +
                "            \"CNTXID\": 1,\n" +
                "            \"DEFAULT\": true,\n" +
                "            \"EPSAPNQOSTPLID\": 21\n" +
                "        }\n" +
                "    ],\n" +
                "    \"AUTHTYPE\": \"5G-AKA\",\n" +
                "    \"AccessRestricted\": false,\n" +
                "    \"BARIMPULIST\": [\n" +
                "        \"sip:460110465211180@ims.mnc011.mcc460.3gppnetwork.org\"\n" +
                "    ],\n" +
                "    \"CDMA2000_1XNOTALLOWED\": false,\n" +
                "    \"CHARGING\": \"0000\",\n" +
                "    \"CHARGTPLID\": 1,\n" +
                "    \"EHRPDNOTALLOWED\": false,\n" +
                "    \"EPCROAMSCHID\": 0,\n" +
                "    \"EPSProfileID\": 27,\n" +
                "    \"EUTRANNOTALLOWED\": false,\n" +
                "    \"GUSSLIST\": [\n" +
                "        {\n" +
                "            \"GSID\": 0,\n" +
                "            \"LIFETIME\": 1800\n" +
                "        }\n" +
                "    ],\n" +
                "    \"HRPDNOTALLOWED\": false,\n" +
                "    \"IMPI\": \"460110465211180@ims.mnc011.mcc460.3gppnetwork.org\",\n" +
                "    \"IMPULIST\": [\n" +
                "        \"sip:+8618007711648@gx.ims.mnc011.mcc460.3gppnetwork.org\",\n" +
                "        \"sip:460110465211180@ims.mnc011.mcc460.3gppnetwork.org\",\n" +
                "        \"tel:+8618007711648\"\n" +
                "    ],\n" +
                "    \"IMSI\": \"460110465211180\",\n" +
                "    \"ISDN\": \"8618007711648\",\n" +
                "    \"MCAP\": [\n" +
                "        77101\n" +
                "    ],\n" +
                "    \"NAMode\": \"BOTH\",\n" +
                "    \"NBIOTNOTALLOWED\": false,\n" +
                "    \"NGCNODETPLID\": \"5\",\n" +
                "    \"NR5GSNOTALLOWED\": false,\n" +
                "    \"NRNOTALLOWED\": false,\n" +
                "    \"OCAP\": [\n" +
                "        77100\n" +
                "    ],\n" +
                "    \"ODBPB1\": false,\n" +
                "    \"ODBPB2\": false,\n" +
                "    \"ODBPB3\": false,\n" +
                "    \"ODBPB4\": false,\n" +
                "    \"ODBPOS\": \"NOBPOS\",\n" +
                "    \"RESULTCODE\": \"0000\",\n" +
                "    \"RESULTDESC\": \"Success\",\n" +
                "    \"RFSP\": 0,\n" +
                "    \"SIFCLIST\": [\n" +
                "        7451,\n" +
                "        2110,\n" +
                "        2180\n" +
                "    ],\n" +
                "    \"SMDATALIST\": [\n" +
                "        {\n" +
                "            \"DNNDATALIST\": [\n" +
                "                {\n" +
                "                    \"DNN\": \"ctnet\",\n" +
                "                    \"DNNQOSTPLID\": \"2\",\n" +
                "                    \"ISDEFAULTDNN\": \"true\",\n" +
                "                    \"IPV4ADDR\": \"172.18.0.16\",\n" +
                "                    \"IPV6ADDR\": \"fe80::e465:2973:f12e:7f42%10\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"DNN\": \"ctwap\",\n" +
                "                    \"DNNQOSTPLID\": \"2\",\n" +
                "                    \"ISDEFAULTDNN\": \"false\",\n" +
                "                    \"IPV4ADDR\": \"172.18.0.16\",\n" +
                "                    \"IPV6ADDR\": \"fe80::e465:2973:f12e:7f42%10\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"DNN\": \"ims\",\n" +
                "                    \"DNNQOSTPLID\": \"1\",\n" +
                "                    \"ISDEFAULTDNN\": \"false\",\n" +
                "                    \"IPV4ADDR\": \"172.18.0.16\",\n" +
                "                    \"IPV6ADDR\": \"fe80::e465:2973:f12e:7f42%10\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"DNN\": \"private.vpdn.gx\",\n" +
                "                    \"DNNQOSTPLID\": \"2\",\n" +
                "                    \"ISDEFAULTDNN\": \"false\",\n" +
                "                    \"IPV4ADDR\": \"172.18.0.16\",\n" +
                "                    \"IPV6ADDR\": \"fe80::e465:2973:f12e:7f42%10\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"DNN\": \"public.vpdn.gx\",\n" +
                "                    \"DNNQOSTPLID\": \"2\",\n" +
                "                    \"ISDEFAULTDNN\": \"false\",\n" +
                "                    \"IPV4ADDR\": \"172.18.0.16\",\n" +
                "                    \"IPV6ADDR\": \"fe80::e465:2973:f12e:7f42%10\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"ISDEFAULTSNSSAI\": true,\n" +
                "            \"SNSSAI\": \"1-000000\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"DEFAULT\": false,\n" +
                "            \"DNNDATALIST\": [\n" +
                "                {\n" +
                "                    \"DNN\": \"ctwap\",\n" +
                "                    \"DNNQOSTPLID\": \"2\",\n" +
                "                    \"ISDEFAULTDNN\": \"false\",\n" +
                "                    \"IPV4ADDR\": \"172.18.0.16\",\n" +
                "                    \"IPV6ADDR\": \"fe80::e465:2973:f12e:7f42%10\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"DNN\": \"ims\",\n" +
                "                    \"DNNQOSTPLID\": \"1\",\n" +
                "                    \"ISDEFAULTDNN\": \"false\",\n" +
                "                    \"IPV4ADDR\": \"172.18.0.16\",\n" +
                "                    \"IPV6ADDR\": \"fe80::e465:2973:f12e:7f42%10\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"DNN\": \"private.vpdn.gx\",\n" +
                "                    \"DNNQOSTPLID\": \"2\",\n" +
                "                    \"ISDEFAULTDNN\": \"false\",\n" +
                "                    \"IPV4ADDR\": \"172.18.0.16\",\n" +
                "                    \"IPV6ADDR\": \"fe80::e465:2973:f12e:7f42%10\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"DNN\": \"public.vpdn.gx\",\n" +
                "                    \"DNNQOSTPLID\": \"2\",\n" +
                "                    \"ISDEFAULTDNN\": \"false\",\n" +
                "                    \"IPV4ADDR\": \"172.18.0.16\",\n" +
                "                    \"IPV6ADDR\": \"fe80::e465:2973:f12e:7f42%10\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"SNSSAI\": \"1-000001\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"UMBNOTALLOWED\": false,\n" +
                "    \"VNTPLID\": 1,\n" +
                "    \"WLANNOTALLOWED\": false,\n" +
                "    \"ZCCount\": 0\n" +
                "}";
        return str;
    }

}
