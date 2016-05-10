


提示：

1、配置扫描路径
          ConstantUtils类中PATH字段为待扫描路径。
          
2、过滤类文件解析路径
          ConstantUtils类中MobilePath字段、TvPath字段分别对应领先版和TV版。
          
3、待保存的静态文件根目录
          ConstantUtils类中ROOTPATH字段，当前设置为TV版：tv_apidocs；领先版：apidocs。
          
4、接口分类参数配置
          InfoUtils类中Mobilemaps对应领先版接口分类map，TVmaps对应TV版接口分类map。在LeftHtmlsUtils类第78行开始修改。
       
5、领先版对应文档目录为apidocs, TV版对应文档目录为tv_apidocs。