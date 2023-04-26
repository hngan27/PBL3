package BLL;
import BLL.AutocompleteTrieList.Trie;
import DTO.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DatasearchBLL {
    DAL.DictDAL dict = new DAL.DictDAL();
    private String file = "E:\\NetBeansFile\\PBL3Riu\\src\\DAL\\dataSearch.txt";
    public List<DataSearchDTO> Search(String search) {
        List<DataSearchDTO> list = new ArrayList<>();
        Trie test = new AutocompleteTrieList.Trie();
//        dict.getListDictEng();
//        for (int i = 0; i < dict.getListDictEng().size(); i++)
//        {
//            test.insert(dict.getListDictEng().get(i));
//        }
        try {
            //AutocompleteTrieList.writeSomeDataFromFile(file, test.root);
            ObjectInputStream oos = new ObjectInputStream(new FileInputStream(file));
            test.root = (AutocompleteTrieList.TrieNode) oos.readObject();
            oos.close();
        } catch (Exception ex) {

        }
        List<String> temp = new ArrayList<>();
        String txt = search;
        temp = test.autocomplete(txt);

        for (String d : temp) {
            if (!temp.isEmpty()) //if (!temp.isEmpty())
            {

                list.add(new DataSearchDTO(d, false));
            }
            if (list.size() == 5) {
                break;
            }
        }
        
        return list;
    }

}
