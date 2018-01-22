/*
* MIT License
* Copyright (c) 2017 argshub
*
*Permission is hereby granted, free of charge, to any person obtaining a copy
*of this software and associated documentation files (the "Software"), to deal
*in the Software without restriction, including without limitation the rights
*to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*copies of the Software, and to permit persons to whom the Software is
*furnished to do so, subject to the following conditions:

*The above copyright notice and this permission notice shall be included in all
*copies or substantial portions of the Software.
*
*THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*SOFTWARE.
 */
package Structural.FluentInterface;
import java.util.ArrayList;
/**
 *
 * @author argshub
 */
public class DB implements SQLQuery {
    private String tableName;
    private String where;
    private String orderBy;
    private DB() {
        this.tableName = this.orderBy = "";
        this.where = null;
    }
    
    public static DB select(String tableName) {
        DB db = new DB();
        db.tableName = tableName;
        return db;
    }
    
    @Override
    public SQLQuery where(String key, String value) {
        if(this.where == null) this.where = " WHERE " + key + " = " + value;
        else this.where  += " AND WHERE " + key + " = " + value;
        return this;
    }
    
    @Override
    public SQLQuery orderBy(String key) {
        this.orderBy = key;
        return this;
    }
    
    @Override
    public String get() {
        String query = "SELECT * FROM " + this.tableName + this.where + " ORDER BY " + this.orderBy;
        System.out.println(query);
        return query;
    }
}
