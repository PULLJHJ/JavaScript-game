package com.game.team1.vo;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
@Data
class Item{
    private String target_code;
    private String word_unit;
    private String word;
    private String word_type;
    private String pos_info;
}
@Data
class Channel{
    private int total;
    private String title;
    private String description;
    private List<Item> item;
}

@Data
class Dictionary{
    private Channel channel;
}
@Slf4j
public class JsonTest {

    public static void main(String[] args) throws IOException{
        String path = "c:\\dev\\share\\dictionary";
        File root = new File(path);
        log.info("exists=>{}",root.exists());
        File[] files = root.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".json");
            }
            
        });
        ObjectMapper om = new ObjectMapper();
        for(File file: files){
            log.info("file name=>{}", file.getName());
            Map<String,Object> map = om.readValue(file,Map.class);
            log.info("map=>{}",map);
            return;
        }
        log.info("file size=?{}", files.length);
    }
    
}
