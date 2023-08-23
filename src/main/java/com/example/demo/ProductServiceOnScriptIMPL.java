package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

@Service
public class ProductServiceOnScriptIMPL implements ProductService{
    private List<Product> itemList = new ArrayList<Product>();

    public ProductServiceOnScriptIMPL() {
        itemList.add(new Product(1, "tom david casual shirt", 0, "This is the sample description for this product", 4500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<>(Arrays.asList("assets/ProductImages/Category1/image1.jpg"))));
        itemList.add(new Product(2, "tom david casual shirt", 0, "This is the sample description for this product", 4550, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<>(Arrays.asList("assets/ProductImages/Category1/image2.jpeg"))));
        itemList.add(new Product(3, "Summer kit", 0, "This is the sample description for this product", 4540, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image3.jpg"))));
        itemList.add(new Product(4, "Navy blue Leggy", 0, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image4.jpg"))));
        itemList.add(new Product(5, "Beach shirt", 0, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image5.png"))));
        itemList.add(new Product(6, "Daniel shirt", 0, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image6.avif"))));
        itemList.add(new Product(7, "Denim", 0, "This is the sample description for this product", 4500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image7.jpg"))));
        itemList.add(new Product(8, "Dark Denim suit", 0, "This is the sample description for this product", 4550, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image8.jpeg"))));
        itemList.add(new Product(9, "Denim", 0, "This is the sample description for this product", 4540, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image9.jpeg"))));
        itemList.add(new Product(10, "Casual Kit", 0, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image10.avif"))));
        itemList.add(new Product(11, "Navy blue shirt", 0, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image11.avif"))));
        itemList.add(new Product(12, "Sparow T", 0, "This is the sample description for this product", 4500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image12.avif"))));
        itemList.add(new Product(13, "Blue Shirt", 0, "This is the sample description for this product", 4550, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image13.avif"))));
        itemList.add(new Product(14, "Sparow shirt", 0, "This is the sample description for this product", 4540, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image14.avif"))));
        itemList.add(new Product(15, "Brown shirt", 0, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image15.webp"))));
        itemList.add(new Product(16, "Beach shirt", 0, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image16.jpg"))));
        itemList.add(new Product(17, "Beach shirt", 0, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image17.jpg"))));
        itemList.add(new Product(18, "Beach shirt", 0, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image18.jpg"))));
        itemList.add(new Product(19, "Coconut shirt", 0, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image19.webp"))));
        itemList.add(new Product(20, "Black & Brown kit", 0, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image20.jpg"))));
        itemList.add(new Product(21, "Beach shirt", 0, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category1/image21.webp"))));

        itemList.add(new Product(1, "tom david casual shirt", 1, "This is the sample description for this product", 4500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image1.webp"))));
        itemList.add(new Product(2, "tom david casual shirt", 1, "This is the sample description for this product", 4550, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image2.webp"))));
        itemList.add(new Product(3, "Tablet", 1, "This is the sample description for this product", 4540, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image3.webp"))));
        itemList.add(new Product(4, "HeadPhone", 1, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image4.jpg"))));
        itemList.add(new Product(5, "Ram", 1, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image5.webp"))));
        itemList.add(new Product(6, "CPU", 1, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image6.webp"))));
        itemList.add(new Product(7, "Laptop", 1, "This is the sample description for this product", 4500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image7.webp"))));
        itemList.add(new Product(8, "Mobile Phone", 1, "This is the sample description for this product", 4550, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image8.jpeg"))));
        itemList.add(new Product(9, "Tablet", 1, "This is the sample description for this product", 4540, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image9.webp"))));
        itemList.add(new Product(10, "Ram", 1, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image10.webp"))));
        itemList.add(new Product(11, "CPU", 1, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image11.webp"))));
        itemList.add(new Product(12, "Laptop", 1, "This is the sample description for this product", 4500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image12.jpg"))));
        itemList.add(new Product(13, "Mobile Phone", 1, "This is the sample description for this product", 4550, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image13.jpeg"))));
        itemList.add(new Product(14, "Tablet", 1, "This is the sample description for this product", 4540, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image14.webp"))));
        itemList.add(new Product(15, "HeadPhone", 1, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image15.avif"))));
        itemList.add(new Product(16, "Ram", 1, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image16.png"))));
        itemList.add(new Product(17, "CPU", 1, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image17.jpg"))));
        itemList.add(new Product(18, "HeadPhone", 1, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image18.jpg"))));
        itemList.add(new Product(19, "Ram", 1, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image19.webp"))));
        itemList.add(new Product(20, "CPU", 1, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image20.avif"))));
        itemList.add(new Product(21, "HeadPhone", 1, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image21.jpg"))));
        itemList.add(new Product(22, "Ram", 1, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image22.webp"))));
        itemList.add(new Product(23, "CPU", 1, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image23.webp"))));
        itemList.add(new Product(24, "CPU", 1, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category2/image24.jpg"))));


        itemList.add(new Product(1, "tom david casual shirt", 2, "This is the sample description for this product", 4500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image1.jpg"))));
        itemList.add(new Product(2, "tom david casual shirt", 2, "This is the sample description for this product", 4550, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image2.jpg"))));
        itemList.add(new Product(3, "Tablet", 2, "This is the sample description for this product", 4540, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image3.jpg"))));
        itemList.add(new Product(4, "HeadPhone", 2, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image4.jpg"))));
        itemList.add(new Product(5, "Ram", 2, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image5.jpg"))));
        itemList.add(new Product(6, "CPU", 2, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image6.jpg"))));
        itemList.add(new Product(7, "Laptop", 2, "This is the sample description for this product", 4500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image7.jpg"))));
        itemList.add(new Product(8, "Mobile Phone", 2, "This is the sample description for this product", 4550, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image8.jpg"))));
        itemList.add(new Product(9, "Tablet", 2, "This is the sample description for this product", 4540, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image9.jpg"))));
        itemList.add(new Product(10, "Ram", 2, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image10.jpg"))));
        itemList.add(new Product(11, "CPU", 2, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image11.jpg"))));
        itemList.add(new Product(12, "Laptop", 2, "This is the sample description for this product", 4500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image12.jpg"))));
        itemList.add(new Product(13, "Mobile Phone", 2, "This is the sample description for this product", 4550, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image13.jpg"))));
        itemList.add(new Product(14, "Tablet", 2, "This is the sample description for this product", 4540, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image14.jpg"))));
        itemList.add(new Product(15, "HeadPhone", 2, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image15.jpg"))));
        itemList.add(new Product(16, "Ram", 2, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image16.jpg"))));
        itemList.add(new Product(17, "CPU", 2, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image17.jpg"))));
        itemList.add(new Product(18, "HeadPhone", 2, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image18.jpg"))));
        itemList.add(new Product(19, "Ram", 2, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image19.jpg"))));
        itemList.add(new Product(20, "CPU", 2, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image20.jpg"))));
        itemList.add(new Product(21, "HeadPhone", 2, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image21.jpg"))));
        itemList.add(new Product(22, "Ram", 2, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image22.jpg"))));
        itemList.add(new Product(23, "CPU", 2, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image23.jpg"))));
        itemList.add(new Product(24, "CPU", 2, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image24.jpg"))));
        itemList.add(new Product(25, "CPU", 2, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image25.jpg"))));
        itemList.add(new Product(26, "HeadPhone", 2, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image26.jpg"))));
        itemList.add(new Product(27, "Ram", 2, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image27.jpg"))));
        itemList.add(new Product(28, "CPU", 2, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image28.jpg"))));
        itemList.add(new Product(29, "HeadPhone", 2, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image29.jpg"))));
        itemList.add(new Product(30, "Ram", 2, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image30.jpg"))));
        itemList.add(new Product(31, "CPU", 2, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image31.jpg"))));
        itemList.add(new Product(32, "CPU", 2, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category3/image32.jpg"))));


        itemList.add(new Product(1, "tom david casual shirt", 3, "This is the sample description for this product", 4500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image1.jpg"))));
        itemList.add(new Product(2, "tom david casual shirt", 3, "This is the sample description for this product", 4550, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image2.jpg"))));
        itemList.add(new Product(3, "Tablet", 3, "This is the sample description for this product", 4540, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image3.jpg"))));
        itemList.add(new Product(4, "HeadPhone", 3, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image4.jpg"))));
        itemList.add(new Product(5, "Ram", 3, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image5.jpg"))));
        itemList.add(new Product(6, "CPU", 3, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image6.webp"))));
        itemList.add(new Product(7, "Laptop", 3, "This is the sample description for this product", 4500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image7.jpg"))));
        itemList.add(new Product(8, "Mobile Phone", 3, "This is the sample description for this product", 4550, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image8.jpg"))));
        itemList.add(new Product(9, "Tablet", 3, "This is the sample description for this product", 4540, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image9.jpg"))));
        itemList.add(new Product(10, "Ram", 3, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image10.jpg"))));
        itemList.add(new Product(11, "CPU", 3, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image11.jpg"))));
        itemList.add(new Product(12, "Laptop", 3, "This is the sample description for this product", 4500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image12.jpg"))));
        itemList.add(new Product(13, "Mobile Phone", 3, "This is the sample description for this product", 4550, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image13.jpg"))));
        itemList.add(new Product(14, "Tablet", 3, "This is the sample description for this product", 4540, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image14.jpg"))));
        itemList.add(new Product(15, "HeadPhone", 3, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image15.jpg"))));
        itemList.add(new Product(16, "Ram", 3, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image16.jpg"))));
        itemList.add(new Product(17, "CPU", 3, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image17.jpg"))));
        itemList.add(new Product(18, "HeadPhone", 3, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image18.jpg"))));
        itemList.add(new Product(19, "Ram", 3, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image19.jpg"))));
        itemList.add(new Product(20, "CPU", 3, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image20.jpg"))));
        itemList.add(new Product(21, "HeadPhone", 3, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image21.jpg"))));
        itemList.add(new Product(22, "Ram", 3, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image22.jpg"))));
        itemList.add(new Product(23, "CPU", 3, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image23.jpg"))));
        itemList.add(new Product(24, "CPU", 3, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image24.jpg"))));
        itemList.add(new Product(25, "CPU", 3, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image25.jpg"))));
        itemList.add(new Product(26, "HeadPhone", 3, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category4/image26.jpg"))));


        itemList.add(new Product(1, "tom david casual shirt", 4, "This is the sample description for this product", 4500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image1.jpg"))));
        itemList.add(new Product(2, "tom david casual shirt", 4, "This is the sample description for this product", 4550, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image2.jpg"))));
        itemList.add(new Product(3, "Tablet", 4, "This is the sample description for this product", 4540, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image3.jpg"))));
        itemList.add(new Product(4, "HeadPhone", 4, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image4.jpg"))));
        itemList.add(new Product(5, "Ram", 4, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image5.jpg"))));
        itemList.add(new Product(6, "CPU", 4, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image6.jpg"))));
        itemList.add(new Product(7, "Laptop", 4, "This is the sample description for this product", 4500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image7.jpg"))));
        itemList.add(new Product(8, "Mobile Phone", 4, "This is the sample description for this product", 4550, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image8.jpg"))));
        itemList.add(new Product(9, "Tablet", 4, "This is the sample description for this product", 4540, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image9.jpg"))));
        itemList.add(new Product(10, "Ram", 4, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image10.jpg"))));
        itemList.add(new Product(11, "CPU", 4, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image11.jpg"))));
        itemList.add(new Product(12, "Laptop", 4, "This is the sample description for this product", 4500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image12.jpg"))));
        itemList.add(new Product(13, "Mobile Phone", 4, "This is the sample description for this product", 4550, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image13.jpg"))));
        itemList.add(new Product(14, "Tablet", 4, "This is the sample description for this product", 4540, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image14.jpg"))));
        itemList.add(new Product(15, "HeadPhone", 4, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image15.jpg"))));
        itemList.add(new Product(16, "Ram", 4, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image16.jpg"))));
        itemList.add(new Product(17, "CPU", 4, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image17.jpg"))));
        itemList.add(new Product(18, "HeadPhone", 4, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image18.jpg"))));
        itemList.add(new Product(19, "Ram", 4, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image19.jpg"))));
        itemList.add(new Product(20, "CPU", 4, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image20.jpg"))));
        itemList.add(new Product(21, "HeadPhone", 4, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image21.jpg"))));
        itemList.add(new Product(22, "Ram", 4, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image22.jpg"))));
        itemList.add(new Product(23, "CPU", 4, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image23.jpg"))));
        itemList.add(new Product(24, "CPU", 4, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image24.jpg"))));
        itemList.add(new Product(25, "CPU", 4, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image25.jpg"))));
        itemList.add(new Product(26, "HeadPhone", 4, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image26.jpg"))));
        itemList.add(new Product(27, "Ram", 4, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image27.jpg"))));
        itemList.add(new Product(28, "CPU", 4, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image28.jpg"))));
        itemList.add(new Product(29, "HeadPhone", 4, "This is the sample description for this product", 3500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image29.jpg"))));
        itemList.add(new Product(30, "Ram", 4, "This is the sample description for this product", 2500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image30.jpg"))));
        itemList.add(new Product(31, "CPU", 4, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image31.jpg"))));
        itemList.add(new Product(32, "CPU", 4, "This is the sample description for this product", 1500, new ArrayList<String>(Arrays.asList("42", "43", "44", "45")), new ArrayList<String>(Arrays.asList("assets/ProductImages/Category5/image32.jpg"))));

    }

    public List<Product> getItemList(int categoryId) {
        return itemList.stream().filter(item -> item.Category==categoryId).collect(Collectors.toList());
    }

    public Product getProductDetails(int categoryId, String productId) {
        return itemList.stream().filter(item -> item.Id==parseInt(productId) && item.Category==categoryId).findFirst().get();
    }

    public int getItemListLength(int categoryId) {
        return itemList.stream().filter(item -> item.Category==categoryId).toList().size();
    }

    public int saveItem(Product product) {
        product.Id = getItemListLength(product.Category) + 1;
        itemList.add(product);
        return product.Id;
    }

    public int updateItem(ProductDTOForUpdating productDTO) {
        Product product = productDTO.item;
        int previousCategoryId = productDTO.previousId;
        itemList.removeIf(item -> item.Id==product.Id && item.Category==previousCategoryId);
        itemList.stream().filter(item -> item.Id>product.Id && item.Category==previousCategoryId).forEach(item -> --item.Id);
        return saveItem(product);
    }

    public void removeItem(int productId){
        itemList.removeIf(item -> item.Id==productId && item.Category==0);
    }


}
