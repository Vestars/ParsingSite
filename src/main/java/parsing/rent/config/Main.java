package parsing.rent.config;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import parsing.rent.data.Product;
import parsing.rent.data.ProductAddress;
import parsing.rent.data.ProductUrl;
import parsing.rent.data.Tag;

public class Main {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Cookie","__cfduid=d0692c0ef649b0a6bd2087d2a58fcf4f91484498906; ajs_anonymous_id=%22c8d376ea-b259-4bb7-98f4-ab5b8e17aa17%22; map_search_markers=%7B%22active_markers%22%3A%5B%2223708-bike-mountain-brooklyn-ny%22%2C%2224606-bike-hybrid-dallas-tx%22%2C%2223709-bike-mountain-brooklyn-ny%22%2C%2221085-bike-hybrid-new-york-ny%22%2C%2223606-standuppaddleboard-inflatable-sup-ann-arbor-mi%22%2C%2222601-standuppaddleboard-surf-sup-denver-colorado%22%2C%2221090-standuppaddleboard-inflatable-sup-new-orleans-la%22%2C%2212971-standuppaddleboard-all-around-sup-salisbury-md%22%2C%228173-bike-cruiser-kobenhavn-o-danmark%22%2C%2215589-bike-cruiser-amsterdam-noord-holland%22%2C%2220251-bike-cruiser-amsterdam-noord-holland%22%2C%2219305-bike-cruiser-amsterdam-noord-holland%22%2C%2218858-bike-cruiser-amsterdam-noord-holland%22%2C%2217818-bike-road-berlin-berlin%22%2C%2222690-bike-mountain-london-england%22%2C%2223330-bike-children-s-kobenhavn-dk%22%2C%2222887-bike-mountain-split-splitsko-dalmatinska-zupanija%22%2C%2225206-skis-all-mountain-geneve%22%2C%2225207-skis-all-mountain-geneve%22%2C%2220227-bike-cruiser-amsterdam-noord-holland%22%2C%2218860-bike-cruiser-amsterdam-noord-holland%22%2C%2210799-bike-fixed-gear-berlin-berlin%22%2C%2213448-surfboard-fun-fish-lisboa-lisboa%22%2C%2214146-bike-mountain-reykjavik-n-a%22%2C%2221356-bike-cruiser-amsterdam-noord-holland%22%2C%2222750-bike-electric-kramfors-vasternorrlands-lan%22%2C%2222918-bike-road-split-splitsko-dalmatinska-zupanija%22%2C%2222932-bike-road-rijeka-primorsko-goranska-zupanija%22%2C%2223329-bike-one-of-a-kind-kobenhavn-dk%22%2C%2222176-bike-single-speed-paris-france%22%2C%2225272-bike-hybrid-london-england%22%2C%2211545-bike-road-london-gb%22%2C%223251-bike-road-suresnes-fr%22%2C%227291-bike-cargo-kobenhavn-o-danmark%22%2C%2223420-bike-folding-amsterdam-noord-holland%22%2C%2212119-bike-road-london-england%22%2C%2211212-bike-single-speed-london-gb%22%2C%2220134-bike-electric-amsterdam-nh%22%2C%2218862-bike-cruiser-amsterdam-noord-holland%22%5D%7D; _cio=9bb9d605-e112-066d-0954-a6137a6bac88; _gat=1; _spinlister-protected_session=anYzT3pxSE1vZzc3R200eW9mTE1hT1A3MkFQQUxON2xZd0JZaFNlNm96MmJLSStMUEd4TjkwNXJYd043R1VBL3JEZFA2djlLZHZCMFBtcWtJdXE5WmpOd1BTTzJMZW5RWEt6bWpXT3Q4SWlWSTU1QUdwZnZWeTBzdnhkSWpYL2dEeWNvN2hqREJIMUJYek8rcjBDajd0d0w2dTl6VGlaMFVIS3NmY0t3ZDBUTzZ1b0NsYVJTcnpnRy9IRDY2cnN4d0lDSUhiZ2RpTHNrMk10Vm5rdEdrZ2VOUzBCaUl4V0s2OE01Y0pOYUhrRC9JZVZwemZobnd4SzA3ZWgxS1pMeEdPdndManlGK2NFaUl0Vjc1RnJLTWNDcWtaUTBYS081YkNDVGJFWG5kdFN1ckJ3VmQ5Rk5sOXptZEJZWEJPamtxaHJSdThURE0rMS84Y0hYbkJEZ08yTzd4bGRiZmx4S2tqaU9iVDZZTm95RXF1Q0E4cUxsK1I2M3V6eWZhbHRPLS1qb1RZZHpiOHIwcGRvZHdzeGtmd2FnPT0%3D--03944c0c93ef6b0fcaf6c2112b56652410997889; ajs_user_id=null; ajs_group_id=null; _ga=GA1.2.1397090744.1484498902; map_search_location=%7B%22locality%22%3Anull%2C%22administrative_area_level_3%22%3Anull%2C%22administrative_area_level_2%22%3Anull%2C%22administrative_area_level_1%22%3Anull%2C%22country%22%3Anull%2C%22lat%22%3A%2252.15887302240058%22%2C%22lng%22%3A%222.8845132312500255%22%2C%22zoom%22%3A7%2C%22radius%22%3A512%2C%22filters%22%3A%7B%22avail_start%22%3A%22%22%2C%22avail_start_time%22%3A%22%22%2C%22surf%22%3Afalse%2C%22bike%22%3Atrue%2C%22snow%22%3Atrue%7D%7D; _hp2_ses_props.3308191412=%7B%22ts%22%3A1486235830507%2C%22d%22%3A%22www.spinlister.com%22%2C%22h%22%3A%22%2Fsearch%2Fs%2Fgelderland%2Fc%2Ftiel%2Floc%2F52.044148431629345%2F4.0161050281250255%2Fz%2F8%22%7D; _hp2_id.3308191412=%7B%22userId%22%3A%222896314200744908%22%2C%22pageviewId%22%3A%228442233225258931%22%2C%22sessionId%22%3A%220248045152233826%22%2C%22identity%22%3Anull%2C%22trackerVersion%22%3A%223.0%22%7D");
        headers.set("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36");
        headers.set("X-CSRF-Token","CB0nUQ0O8XZ2xpBuon9mNZT0BaaXm7q6acOf9V7boDAMBEdVQgTZ2Ssz54/FW/BY2ClCQJugD1TWJ5vkaU/AeQ==");
        headers.set("X-Requested-With","XMLHttpRequest");
        HttpEntity<String> entity = new HttpEntity<>("", headers);


        ResponseEntity<Product[]> result = restTemplate.exchange("https://www.spinlister.com/search/", HttpMethod.POST, entity, Product[].class);
        for(int i = 0; i < result.getBody().length; i++){
            System.out.println(result.getBody()[i]);
            System.out.println(result.getBody()[i].getTitle());
        }

    }
}
